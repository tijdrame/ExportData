package com.boa.api.processor;

import com.boa.api.domain.MVTC16;

import org.springframework.batch.item.ItemProcessor;

public class MVTC16ItenProcessor implements ItemProcessor<MVTC16, MVTC16> {

    @Override
    public MVTC16 process(MVTC16 item) throws Exception {
        // object input, object output (ici c le meme objet); on peut faire un traitement metier
        return item;
    }

}
