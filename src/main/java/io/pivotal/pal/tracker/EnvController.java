package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {

    private final String port;
    private final String memory_limit;
    private final String cf_instance_index;
    private final String cf_instance_addr;


    public EnvController( @Value("${port:NOT SET}") String port ,
                          @Value("${memory_limit:NOT SET}") String memory_limit ,
                          @Value("${cf_instance_index:NOT SET}") String cf_instance_index ,
                          @Value("${cf_instance_addr:NOT SET}") String cf_instance_addr ) {

        this.port = port;
        this.memory_limit = memory_limit;
        this.cf_instance_index = cf_instance_index;
        this.cf_instance_addr = cf_instance_addr;

    }

    @GetMapping("/env")
    public Map<String, String> getEnv() {

        return new HashMap<String, String>(){{
            put("PORT",port);
            put("MEMORY_LIMIT",memory_limit);
            put("CF_INSTANCE_INDEX",cf_instance_index);
            put("CF_INSTANCE_ADDR",cf_instance_addr);
        }};


    }


}


//public class WelcomeController {
//
//    private static String message;
//
//    public WelcomeController(@Value("${welcome.message}") String message){
//        this.message = message;
//    }
//
//    @GetMapping("/")
//    public String sayHello() {
//        return message;
//    }


