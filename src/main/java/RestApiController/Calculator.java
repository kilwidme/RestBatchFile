package RestApiController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	
	@GetMapping("addition")
	@ResponseBody
	public double addition(@RequestParam double firstoperand, @RequestParam  double secondoperand)
	{
		return firstoperand+secondoperand;
	}

}
