package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import entidade.Categoria;
import managedbean.CategoriaMB;

@FacesConverter("categoriaConverter")
public class CategoriaConverter implements Converter {
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && value.trim().length() > 0) {
			try {
				CategoriaMB categoriaMB = (CategoriaMB) fc.getExternalContext().getApplicationMap().get("categoriaMB");
				for (Categoria cat : categoriaMB.getCategorias()) {
					if (cat.getDescricao().equals(value))
						return cat;
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
			if (object instanceof Categoria)
				return ((Categoria) object).getDescricao();
		}

		return null;

	}
}