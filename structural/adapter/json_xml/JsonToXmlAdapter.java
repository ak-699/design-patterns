package structural.adapter.json_xml;

public class JsonToXmlAdapter implements XmlData {
    JsonService jsonService;

    public JsonToXmlAdapter(JsonService jsonService) {
        this.jsonService = jsonService;
    }

    @Override
    public void getXmlData() {
        System.out.println("Json to xml adapter");
        jsonService.getJsonData();
        System.out.println("Converted xml data");
    }

}
