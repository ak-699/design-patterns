package structural.adapter.json_xml;

public class Demo {
    public static void main(String[] args) {
        JsonService jsonService = new JsonService();
        XmlData xmlData = new JsonToXmlAdapter(jsonService);
        xmlData.getXmlData();
    }
}

// Roles in Adapter Pattern

// Client → The code (or system) that wants to use a certain interface.

// In our case, the client expects to work with XmlData.

// In the example, the Main class is the client.

// Service (Adaptee) → The existing/legacy class that has an incompatible
// interface.

// In our case, that’s the JsonService, which provides getJsonData().

// It’s useful but doesn’t match what the client wants.

// Target Interface → The interface the client expects.

// That’s XmlData, which defines getXmlData().

// Adapter → The bridge that converts the service’s interface into the target
// interface.

// That’s JsonToXmlAdapter, which implements XmlData but internally uses
// JsonService.
