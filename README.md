# SDP-MSP-SpringCloud
#### 名词解释：

- SDP: Software Development Platform(软件开发平台)
- MSP: Mobility Services Platform(移动服务平台)



#### 更新记录：

##### 20230614:

1. 整理项目的pom依赖问题
   1.1 最外层pom（SDP-MSP-SpringCloud）管理依赖服务（MSP-Dependencies）

   1.2 项目通用依赖全部放到MSP-Dependencies中进行管理，使用springcloud、springboot、springadmin的通用依赖，后续可以引入nacos的通用依赖。

2. 依赖升级

   使用最新版本的springcloud依赖，需要更改JDK版本，spring3.0以上只支持JDK17+以上版本。

3. 整理eureka服务

   以该服务为准，正常启动。配置负载均衡，Ribbon停止更新，springcloud中重新实现了loadbalancer。
