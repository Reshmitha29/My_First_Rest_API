package Learning_Rest_API.MyRestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller should control a rest aPI
//link of this API should be hello-world
@RestController
public class HelloWorldRestApiController {
	
	@GetMapping(path = "/hello-world")
     public String HelloWorld(){
    	 return "Hello World... love u ";
     }
	
	//mehod to return a hello world bean back
	@GetMapping(path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean(){
   	 return new HelloWorldBean("Hello World... love u ");
    }
}
