#!/bin/bash

LOG_FILE="/var/log/scan_CVE.log

debsecan > $LOG_FILE

echo "Le scan a été fait à $(date)" >> $LOG_FILE