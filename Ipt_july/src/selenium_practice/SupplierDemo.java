package selenium_practice;

import java.time.LocalTime;
import java.util.function.Supplier;

import net.bytebuddy.asm.Advice.Local;

class SupplierImp implements Supplier<LocalTime>{

	@Override
	public LocalTime get() {
		return LocalTime.now();
	}
	
}

public class SupplierDemo {
	
	
	public static void main(String[] args) {
		
SupplierImp si = new SupplierImp();
LocalTime Print = si.get();
System.out.println(Print);
	}

}
