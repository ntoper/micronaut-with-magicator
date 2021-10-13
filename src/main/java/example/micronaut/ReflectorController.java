package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.manycore.Reflector;

@Controller("/reflector") 
public class ReflectorController {


    @Get("/ref") 
    public String ref() throws ClassNotFoundException { 
        return "All classes\n-----------------\n" + Reflector.reflect();
    }
}
