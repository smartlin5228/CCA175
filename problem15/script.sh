#!/bin/bash

start_logs
flume-ng agent -n agent1 --conf ./ -conf-file ./flume.conf 
sleep 1m
stop_logs
