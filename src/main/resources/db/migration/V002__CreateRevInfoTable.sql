create table revinfo
(
    rev      integer not null auto_increment,
    revtstmp bigint,
    primary key (rev)
);

create table student_aud
(
    rev     integer not null,
    revtype tinyint,
    id      bigint  not null,
    name    varchar(255),
    primary key (rev, id),
    foreign key (rev) references revinfo (rev)
);
# alter table student_aud
#     add constraint FKj009xm0wjydklskl2dgnfyyjq
#         foreign key (rev)
#             references revinfo (rev)