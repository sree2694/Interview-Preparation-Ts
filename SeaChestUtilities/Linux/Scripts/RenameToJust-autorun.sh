#!/bin/sh
# Using the Tiny Core bootable USB, the SeaChest start script looks for a file
# named autorun.sh in the root folder and runs it and then ends after running it.
# If that file name does not exist then the SeaChest start script reads the Linux
# kernel append parameters looking for texec= like (texec="SeaChest_Basics --scan
# --echoCommandLine") and runs it.  You can inspect the kernel startup parameters
# with cat /proc/cmdline . If that append parameter does not exist then the
# SeaChest start script just runs a default SeaChest --scan.

#echo "===================================="
#echo "This is an example autorun.sh script"
#echo "===================================="

echo ""
echo "Waiting 10 seconds to finish the SAS device discovery."
echo "This tool can only download firmware to the drive if it is found during this discovery process."
sleep 10
SeaChest_Firmware --scan
echo "Firmware Download to start in 5 seconds"
sleep 5
# The example below is just a placeholder for your actual firmware file name and matching model number
SeaChest_Firmware -d all --downloadFW E002.LOD --modelMatch ST8000NM0075 --echoCommandLine
echo ""
SeaChest_Firmware --scan
echo " Download Complete. The System will power off in 60 seconds."
echo " Press Ctrl-C to abort this script."
sleep 60
sudo poweroff
