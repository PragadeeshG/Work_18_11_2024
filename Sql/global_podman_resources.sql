create table if not exists global_podman_resources(
service_id bigint not null,
service_code varchar(255) null,
broad_network_access varchar(255) null,
on_ansible_mode char null,
self_service_mode char null,
resource_pooling varchar(255) null,
content_delivery_network varchar(255) null,
phsysical_server_count varchar(255) null,
virtual_server_access varchar(255) null,
value_proposition varchar(255) null,
cost_reductions_pattern varchar(255) null,
constraint global_podman_resources_pk primary key(service_id));