import org.mule.api.annotations.Transformer;
import org.mule.module.json.JsonData;

public class ObtenerURLCorrecta{
	@Transformer
	public String obtenerURL(JsonData obj){
		return obj.getAsString("datos");
	}
}