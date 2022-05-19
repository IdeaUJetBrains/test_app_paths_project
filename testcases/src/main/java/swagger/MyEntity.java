package swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "myEntity")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "myEntity", description = "MyEntity resource representation")
public class MyEntity {
    @XmlAttribute(name = "id")
    @ApiModelProperty(value = "MyEntity's id")
    private String id;

    @XmlElement(name = "code")
    @ApiModelProperty(value = "MyEntity's code")
    private String code;

    @XmlTransient
    private String desc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
