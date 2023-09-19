--Cria Schema
CREATE database db_deliverycenter;

USE db_deliverycenter;

CREATE TABLE `db_deliverycenter`.`channels` (
  `channel_id` int DEFAULT NULL,
  `channel_name` text,
  `channel_type` text);

CREATE TABLE `db_deliverycenter`.`hubs` (
  `hub_id` int DEFAULT NULL,
  `hub_name` text,
  `hub_city` text,
  `hub_state` text,
  `hub_latitude` double DEFAULT NULL,
  `hub_longitude` double DEFAULT NULL);

CREATE TABLE `db_deliverycenter`.`stores` (
  `store_id` int DEFAULT NULL,
  `hub_id` int DEFAULT NULL,
  `store_name` text,
  `store_segment` text,
  `store_plan_price` int DEFAULT NULL,
  `store_latitude` text,
  `store_longitude` text);


CREATE TABLE `db_deliverycenter`.`drivers` (
  `driver_id` int DEFAULT NULL,
  `driver_modal` text,
  `driver_type` text);


CREATE TABLE `db_deliverycenter`.`deliveries` (
  `delivery_id` int DEFAULT NULL,
  `delivery_order_id` int DEFAULT NULL,
  `driver_id` int DEFAULT NULL,
  `delivery_distance_meters` int DEFAULT NULL,
  `delivery_status` text);


CREATE TABLE `db_deliverycenter`.`payments` (
  `payment_id` int DEFAULT NULL,
  `payment_order_id` int DEFAULT NULL,
  `payment_amount` double DEFAULT NULL,
  `payment_fee` double DEFAULT NULL,
  `payment_method` text,
  `payment_status` text);


CREATE TABLE `db_deliverycenter`.`orders` (
  `order_id` int DEFAULT NULL,
  `store_id` int DEFAULT NULL,
  `channel_id` int DEFAULT NULL,
  `payment_order_id` int DEFAULT NULL,
  `delivery_order_id` int DEFAULT NULL,
  `order_status` text,
  `order_amount` double DEFAULT NULL,
  `order_delivery_fee` int DEFAULT NULL,
  `order_delivery_cost` text,
  `order_created_hour` int DEFAULT NULL,
  `order_created_minute` int DEFAULT NULL,
  `order_created_day` int DEFAULT NULL,
  `order_created_month` int DEFAULT NULL,
  `order_created_year` int DEFAULT NULL,
  `order_moment_created` text,
  `order_moment_accepted` text,
  `order_moment_ready` text,
  `order_moment_collected` text,
  `order_moment_in_expedition` text,
  `order_moment_delivering` text,
  `order_moment_delivered` text,
  `order_moment_finished` text,
  `order_metric_collected_time` text,
  `order_metric_paused_time` text,
  `order_metric_production_time` text,
  `order_metric_walking_time` text,
  `order_metric_expediton_speed_time` text,
  `order_metric_transit_time` text,
  `order_metric_cycle_time` text);
