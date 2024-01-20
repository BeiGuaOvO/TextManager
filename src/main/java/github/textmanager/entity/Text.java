package github.textmanager.entity;

public class Text {
    private String name,uuid,message;

    public Text(String name,String uuid,String message){
        this.name=name;
        this.uuid=uuid;
        this.message=message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
