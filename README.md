# springcloudDalston .
使用feign的时候注意问题@FeignClient(服务提供者),小敏哥此处写成了消费者服务名字,导致一直找不到这个服务!特此记录!
使用Hystrix Dashboard来展示Hystrix用于熔断的各项度量指标时Hystrix Dashboard的主界面地址应填入http://localhost:当前消费者端口/hystrix.stream
此套架构记录为公司当时做技术选型时搭建，后面未选用就停更了，项目基础架构包括监控等都已集成，后续会根据个人时间继续更新！
