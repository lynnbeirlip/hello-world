package webElements;

import java.util.List;

import com.sun.media.jfxmedia.Media;

import java.util.ArrayList;

public class GetElementList getElementList(String locator, String type) {
    type = type.toLowerCase();
    if (type.equals("id")) {
    	System.out.println("Element found with id: " + locator);
    	return this.driver.findElements(By.id(locator));
    	
    }
    else if (type.equals("xpath")) {
    	System.out.println("Element found with xpath: " + locator);
    	return this.driver.findElements(By.xpath(locator));		
    }
    else {
    	System.out.println("Locator type not supported");
    	return null;
    	
    }
}
}
