package swagger

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import javax.xml.bind.annotation.*

@XmlRootElement(name = "myEntity")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "myEntity", description = "MyEntity resource representation")
class MyEntity {
    @XmlAttribute(name = "id")
    @ApiModelProperty(value = "MyEntity's id")
    var id: String? = null

    @XmlElement(name = "code")
    @ApiModelProperty(value = "MyEntity's code")
    var code: String? = null

    @XmlTransient
    var desc: String? = null
}
