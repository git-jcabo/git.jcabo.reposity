package org.jcabo.jcabospring.service.controller.jcabotest;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

public class TestSteam {

    public static void main (String[] args) {
//        streamSum();
        directSum();
    }

    public static void streamSum(){
        Instant start = Instant.now();

        LongStream.rangeClosed(0, 100000000000L)
                .parallel().reduce(Long::sum);

        Instant end = Instant.now();
        System.out.println("耗时===" + Duration.between(start, end).toMillis());

    }

    public static void directSum(){
        Instant start = Instant.now();
        long sum = 0L;
        for (long i = 0; i <= 100000000000L; i++) {
            sum += i;
        }
        Instant end = Instant.now();
        System.out.println("耗时===" + Duration.between(start, end).toMillis());
    }

}
