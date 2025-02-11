/*
 * eiam-application-cas - Employee Identity and Access Management Program
 * Copyright © 2020-2023 TopIAM (support@topiam.cn)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.topiam.employee.application.cas.pojo;

import cn.topiam.employee.common.enums.app.AuthorizationType;
import cn.topiam.employee.common.enums.app.CasUserIdentityType;
import cn.topiam.employee.common.enums.app.InitLoginType;

import lombok.Data;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author TopIAM
 * Created by support@topiam.cn on  2023/1/2 22:23
 */
@Data
@Schema(description = "CAS 配置返回结果")
public class AppCasStandardConfigGetResult {

    /**
     * 应用id
     */
    @Schema(description = "应用id")
    private String                 appId;

    /**
     * SSO 发起方
     */
    @Parameter(description = "SSO 发起方")
    private InitLoginType          initLoginType;

    /**
     * SSO 登录链接
     */
    @Parameter(description = "SSO 登录链接")
    private String                 initLoginUrl;

    /**
     * 授权范围
     */
    @Parameter(description = "SSO 授权范围")
    private AuthorizationType      authorizationType;

    /**
     * 客户端服务URL
     */
    @Schema(name = "客户端服务URL")
    private String                 clientServiceUrl;

    /**
     * 用户身份类型标识
     */
    @Schema(name = "用户身份类型标识")
    private CasUserIdentityType    userIdentityType;

    /**
     * serviceTicket 过期时间（秒）
     */
    @Schema(name = "serviceTicket 过期时间（秒）")
    private Integer                serviceTicketExpireTime;
    /**
     * CAS 协议端点
     */
    @Schema(name = "CAS 协议端点")
    private AppCasProtocolEndpoint protocolEndpoint;
}
