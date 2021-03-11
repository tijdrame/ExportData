package com.boa.api.config;

import java.io.IOException;
import java.io.Writer;

import javax.sql.DataSource;

import com.boa.api.domain.MVTC15;
import com.boa.api.domain.MVTC16;
import com.boa.api.mapper.MVTC15RowMapper;
import com.boa.api.mapper.MVTC16RowMapper;
import com.boa.api.processor.MVTC15ItenProcessor;
import com.boa.api.processor.MVTC16ItenProcessor;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileHeaderCallback;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * BatchConfiguration
 */
@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private DataSource dataSource;

    @Bean
    public JdbcCursorItemReader<MVTC16> reader() {
        JdbcCursorItemReader<MVTC16> cursorItemReader = new JdbcCursorItemReader<>();
        cursorItemReader.setDataSource(dataSource);
        cursorItemReader.setSql("select * from MVTC16 where compte in (03920860008, 03920860008, 04518050015)");
        cursorItemReader.setRowMapper(new MVTC16RowMapper());
        return cursorItemReader;
    }

    @Bean
    public MVTC16ItenProcessor processor() {
        return new MVTC16ItenProcessor();
    }

    @Bean
    public FlatFileItemWriter<MVTC16> writer() {
        FlatFileItemWriter<MVTC16> writer = new FlatFileItemWriter<>();
        writer.setResource(new ClassPathResource("./MVTC16.dsv"));
        FlatFileHeaderCallback headerCallback = new FlatFileHeaderCallback(){
        
            @Override
            public void writeHeader(Writer writer) throws IOException {
                writer.write("compte|"+"datoper|"+"datval|"+"mntdev|"+"libelle|"+ 
                "codopsc|expl|natop|refrel|nooper|dathgen|noref|datech|xcash");                
            }
        };
        writer.setHeaderCallback(headerCallback);
        DelimitedLineAggregator<MVTC16> lineAggregator = new DelimitedLineAggregator<>();
        lineAggregator.setDelimiter("|");

        BeanWrapperFieldExtractor<MVTC16> fieldExtractor = new BeanWrapperFieldExtractor<>();
        fieldExtractor.setNames(new String []{"compte", "datoper", "datval", "mntdev", "libelle", 
        "codopsc", "expl", "natop", "refrel", "nooper", "dathgen", "noref", "datech", "xcash"});
        lineAggregator.setFieldExtractor(fieldExtractor);

        writer.setLineAggregator(lineAggregator);
        return writer;
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory
            .get("step1")
            .<MVTC16, MVTC16>chunk(100)
            .reader(reader())
            .processor(processor())
            .writer(writer())
            .build();
    } 

    

    //MVTC 15
    @Bean
    public JdbcCursorItemReader<MVTC15> reader15() {
        JdbcCursorItemReader<MVTC15> cursorItemReader = new JdbcCursorItemReader<>();
        cursorItemReader.setDataSource(dataSource);
        cursorItemReader.setSql("select * from MVTC15 where compte in (03920860008, 03920860008, 04518050015)");
        cursorItemReader.setRowMapper(new MVTC15RowMapper());
        return cursorItemReader;
    }

    @Bean
    public MVTC15ItenProcessor processor15() {
        return new MVTC15ItenProcessor();
    }

    @Bean
    public FlatFileItemWriter<MVTC15> writer15() {
        FlatFileItemWriter<MVTC15> writer = new FlatFileItemWriter<>();
        writer.setResource(new ClassPathResource("./MVTC15.dsv"));

        FlatFileHeaderCallback headerCallback = new FlatFileHeaderCallback(){
            @Override
            public void writeHeader(Writer writer) throws IOException {
                writer.write("compte|"+"datoper|"+"datval|"+"mntdev|"+"libelle|"+ 
                "codopsc|expl|natop|refrel|nooper");                
            }
        };
        writer.setHeaderCallback(headerCallback);

        DelimitedLineAggregator<MVTC15> lineAggregator = new DelimitedLineAggregator<>();
        lineAggregator.setDelimiter("|");

        BeanWrapperFieldExtractor<MVTC15> fieldExtractor = new BeanWrapperFieldExtractor<>();
        fieldExtractor.setNames(new String []{"compte", "datoper", "datval", "mntdev", "libelle", 
        "codopsc", "expl", "natop", "refrel", "nooper"});
        lineAggregator.setFieldExtractor(fieldExtractor);

        writer.setLineAggregator(lineAggregator);
        return writer;
    }

    @Bean
    public Step step2() {
        return stepBuilderFactory
            .get("step2")
            .<MVTC15, MVTC15>chunk(100)
            .reader(reader15())
            .processor(processor15())
            .writer(writer15())
            .build();
    } 
    // fin 15

    @Bean
    public Job exportMVTC16Job3() {
        return jobBuilderFactory
            .get("exportMVTC16Job3")
            //.incrementer(new RunIdIncrementer())
            .flow(step1())
            .next(step2())
            .end()
            .build();
    }
    
}