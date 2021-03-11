package com.boa.api.processor;

import com.boa.api.domain.MVTC15;

import org.springframework.batch.item.ItemProcessor;

public class MVTC15ItenProcessor implements ItemProcessor<MVTC15, MVTC15> {

    @Override
    public MVTC15 process(MVTC15 item) throws Exception {
        // object input, object output (ici c le meme objet); on peut faire un traitement metier
        return item;
    }

}
