package in.mycp.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.roo.addon.dbre.RooDbManaged;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooDbManaged(automaticallyDelete = true)
@RooJpaActiveRecord(versionField = "", table = "ip_permission_p", finders = { "findIpPermissionPsByGroupDescription", "findIpPermissionPsByProtocolEqualsAndToPortEqualsAndFromPortEquals", "findIpPermissionPsByGroupDescriptionAndProtocolEqualsAndFromPortEquals" })
public class IpPermissionP {

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
