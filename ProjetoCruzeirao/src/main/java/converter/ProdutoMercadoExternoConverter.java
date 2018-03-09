package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import entidade.ProdutoMercadoExterno;
import managedbean.ProdutoMercadoExternoMB;

@FacesConverter("produtoMercadoExternoConverter")
public class ProdutoMercadoExternoConverter implements Converter {
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && value.trim().length() > 0) {
			try {
				ProdutoMercadoExternoMB produtoMercadoExternoMB = (ProdutoMercadoExternoMB) fc.getExternalContext().getApplicationMap().get("produtoMercadoExternoMB");
				for (ProdutoMercadoExterno pro : produtoMercadoExternoMB.getProdutos()) {
					if (pro.getNome().equals(value))
						return pro;
				}

			} catch (NumberFormatException e) {
				// throw new ExcrConverterException(new
				// FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error",
				// "Not a valid theme."));
			}
		}

		return null;
	}

	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		if (object != null) {
			if (object instanceof ProdutoMercadoExterno)
				return ((ProdutoMercadoExterno) object).getNome();
		}

		return null;

	}
}