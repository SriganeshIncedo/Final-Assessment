package Final;

abstract class Window {
	
    public abstract void print();
    public abstract void scan();
    
}

class PMWindow extends Window {

   @Override
    public void print() {
	   
        System.out.println("PM Window printing");
        
    }

   @Override
    public void scan() {
	   
        System.out.println("PM Window scanning");
        
    }
    
}



class MotifWindow extends Window {
	
	@Override
    public void print() {
        System.out.println("MotifWindow printing");
        
    }

   @Override
    public void scan() {
        System.out.println("MotifWindow scanning");
        
    }
}

abstract class ScrollBar {
	
    public abstract void scrollTop();
    public abstract void scrollBottom();
    
}

class PMScrollBar extends ScrollBar {

   @Override
    public void scrollTop() {
	   
        System.out.println("Top PMScrollBar");
        
    }

   @Override
    public void scrollBottom() {
	   
        System.out.println("Bottom PMScrollBar");
        
    }
}

class MotifScrollBar extends ScrollBar {

   @Override
    public void scrollTop() {
	   
        System.out.println("Top MotifScrollBar");
        
    }

   @Override
    public void scrollBottom() {
	   
        System.out.println("Bottom MotifScrollBar");
        
    }
}

abstract class WidgetFactory {
	
    abstract Window createWindow();
    abstract ScrollBar createScrollBar();
    
}

class PMWidgetFactory extends WidgetFactory {
    
	Window createWindow() {
		
        return new PMWindow();
        
    }
	
    ScrollBar createScrollBar() {
    	
        return new PMScrollBar();
        
    }
}

class MotifWidgetFactory extends WidgetFactory {
    
	Window createWindow() {
		
        return new MotifWindow();
    }
	
    ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }
}

class FactoryMaker {
	
    private static WidgetFactory WF=null;
    static WidgetFactory getFactory(String choice) {
    	
        if(choice.equals("1")) {
        	
            WF=new PMWidgetFactory();
        }
        
        else if(choice.equals("2")) {
        	
            WF=new MotifWidgetFactory();
        }
        return WF;
    }
}


public class Client {
    public static void main(String args[]) {
    	// TODO Auto-generated method stub
    	
        WidgetFactory WF = FactoryMaker.getFactory("1");
        Window wd = WF.createWindow();
        wd.scan();
        
    }
}
