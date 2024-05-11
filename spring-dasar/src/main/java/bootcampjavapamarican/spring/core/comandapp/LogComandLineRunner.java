package bootcampjavapamarican.spring.core.comandapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Slf4j
@Component
public class LogComandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Log Command Line Runner : {}", Arrays.toString(args));
    }
}
