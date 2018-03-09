package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import entidade.ProdutoMercadoInterno;
import managedbean.ProdutoMercadoInternoMB;

@FacesConverter("produtoMercadoInternoConverter")
public class ProdutoMercadoInternoConverter implements Converter {
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && value.trim().length() > 0) {
			try {
				ProdutoMercadoInternoMB produtoMercadoInternoMB = (ProdutoMercadoInternoMB) fc.getExternalContext().getApplicationMap().get("produtoMercadoInternoMB");
				for (ProdutoMercadoInterno pro : produtoMercadoInternoMB.getProdutos()) {
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
			if (object instanceof ProdutoMercadoInterno)
				return ((ProdutoMercadoInterno) object).getNome();
		}

		return null;

	}
}