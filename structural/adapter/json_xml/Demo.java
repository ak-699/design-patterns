package structural.adapter.json_xml;

public class Demo {
    public static void main(String[] args) {
        JsonService jsonService = new JsonService();
        XmlData xmlData = new JsonToXmlAdapter(jsonService);
        xmlData.getXmlData();
    }
}
