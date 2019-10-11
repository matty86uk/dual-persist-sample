package com.example.dualpersistsample;

import mat.mat.mat.multirepo.transformer.JpaTransformer;
import mat.mat.mat.multirepo.transformer.JpaTransformerCache;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTransformer {

    @Test
    public void forward(){

        final SampleTransformer transformer = new SampleTransformer();

        final From from = From.builder().value("Hello").build();
        final To to = transformer.transformForward(from, new JpaTransformerCache());

        final From fromAgain = transformer.transformBackward(to, new JpaTransformerCache());

        assertThat(from).isEqualTo(fromAgain);
    }

    @Test
    public void backward(){

        final SampleTransformer transformer = new SampleTransformer();

        final To to = To.builder().value("Good Bye").build();
        final From from = transformer.transformBackward(to, new JpaTransformerCache());

        final To toAgain = transformer.transformForward(from, new JpaTransformerCache());

        assertThat(to).isEqualTo(toAgain);
    }

    class SampleTransformer implements JpaTransformer<From, To> {
    }
}
