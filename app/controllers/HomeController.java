package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller 
{

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(String name) 
	{
        	return ok(index.render("Welcome to the home page",name));
    	}
	
	public Result about()
	{	
		return ok(about.render("Welcome to the about us page"));
	}
	public Result Product()
	{
		return ok(Product.render("Our Products"));
	}

	public Result contact_us()
	{
		return ok(contact_us.render("Our contact details"));
	}
}

