package converter;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import entidade.Cliente;
import managedbean.ClienteMB;

@FacesConverter("clienteConverter")
public class ClienteConverter implements Converter{
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if(value != null && value.trim().length() > 0) {
	        try {
	            ClienteMB ClienteMB = (ClienteMB) fc.getExternalContext().getApplicationMap().get("clienteMB");
	            for(Cliente cli : ClienteMB.getClientes())
	            {
	            	if(cli.getNome().equals(value))
	            		return cli;
	            }
	            
	          
	        } catch(NumberFormatException e) {
	          //  throw new ExcrConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
	        }
	    }
	    
    return null;
}

	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		if (object != null) {
			if (object instanceof Cliente)
				return ((Cliente) object).getNome();
		}

		return null;

	}
}