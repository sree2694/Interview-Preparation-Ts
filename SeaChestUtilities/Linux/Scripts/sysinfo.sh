#!/bin/sh
#sysinfo.sh

runandlog() {
  if ! which "$1" >/dev/null; then
    echo "No $1 found on system" | tee -a "$logfile"
  else
    echo "" | tee -a "$logfile"
    echo -e "$@\n---------------------------" | tee -a "$logfile"
    exec $* | tee -a "$logfile"
  fi
  echo -e "\n"
}

logfile=sysinfo.log
if [ -n "$1" ]; then
  logfile=$1
fi
if [ -e "$logfile" ]; then
  find -mindepth 1 -name "$logfile.*" | awk -F. '{ print $NR $0 }' | sort -nr | sed 's/^[[:digit:]]\+//' | while read old; do
    version=${old##*.}
    mv "$logfile.$version" "$logfile.$((version+1))"
  done
  mv "$logfile" "$logfile.1"
fi

runandlog echo "Tiny Core v$(version)" 
runandlog cat '/proc/version'
runandlog uname '--all'
runandlog cat '/proc/cmdline'
runandlog ls '/proc'
runandlog lscpu
runandlog ls '/dev/sg*'
runandlog ls '/dev/sd*'
runandlog ls '/dev/nvme*'
runandlog ls '-la /dev/disk/by-path/'
runandlog lspci '-t -v -nn'
runandlog lsmod
runandlog lsscsi '--hosts --transport'
runandlog lsscsi '--device --generic --scsi_id --size'
runandlog lsblk '--include 8 --tree --paths --output NAME,MAJ:MIN,TYPE,HCTL,VENDOR,MODEL,SIZE,SERIAL,REV,PHY-SEC'
runandlog findmnt '--tree --output TARGET,SOURCE,MAJ:MIN,SIZE,USED,AVAIL,USE%,FSTYPE'
runandlog SeaChest_Basics '--scan --scanFlags sgtosd --echoCommandLine'
less "$logfile"
