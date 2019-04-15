package com.github.sech.commons.config.properties;

import lombok.Getter;
import lombok.Setter;

/**
 * Swagger 属性配置
 *
 * @author sech.io
 */
@Setter
@Getter
public class SwaggerProperties {

    private String title = " API Online ";

    private String description = "https://github.com/sech-io/cloud-framework/wiki";

    private String termsOfServiceUrl = "https://github.com/sech-io/cloud-framework";

    private String version = "1.0";

    private String license = "Apache License 2.0";

    private String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";

    private String contactName = "sech.io";

    private String contactUrl = "https://github.com/sech-io/cloud-framework";

    private String contactEmail = "ovrn@live.com";

    private boolean headerAuthorization = true;

}
