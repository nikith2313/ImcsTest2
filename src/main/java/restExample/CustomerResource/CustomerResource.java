package restExample.CustomerResource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restExample.Bean.Passenger;
import restExample.Services.PassengerOperationImple;

@RestController
public class CustomerResource {
	
	
@Autowired
PassengerOperationImple co;
	
@RequestMapping(path="/hello",method=RequestMethod.GET)
	public String hello(){
	return "hello nikki"; 
}
@PostMapping(value="/addPassenger")
public boolean addCustomer(@RequestBody Passenger passenger){
	System.out.println("called");
	int cust=co.addPassenger(passenger);
	return cust>0?true:false; 
}

@GetMapping(value="showallPassengers")
public List<Passenger> showCustomers(){

	List<Passenger> cust=co.getPassenger();
	return cust; 
}

@PostMapping(value="deleteCustomer")
public boolean deleteCustomers(@PathVariable int id){

	boolean cust=co.deletePassenger(id);
	return cust; 
}

@PostMapping(value="getPassenger")
public Passenger getPassenger(@PathVariable int id){

	Passenger cust=co.displayPassenger(id);
	return cust; 
}

}
