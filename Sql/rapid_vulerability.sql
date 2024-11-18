create table if not exists rapid_vulerability(
region_code bigint not null,
data_centre Integer null,
capabilities varchar(255) null,
vulnerableally_provisioned varchar(255) null,
vulnerableally_released varchar(255) null,
auto_scale_with_ansible varchar(255) null,
networking_provisions varchar(255) null,
rapid_vulnerable_mode varchar(255) null,
latency_avoidance varchar(255) null,
constraint rapid_vulerability_pk primary key(region_code));