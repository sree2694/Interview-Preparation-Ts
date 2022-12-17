@echo off
REM see https://stackoverflow.com/questions/9922498/calculate-time-difference-in-windows-batch-file
REM as answered by MikeQ
REM A re-hash of Aacini's code because most likely you are going to set the start time as a variable and want to save that data for output:

rem ******************  MAIN CODE SECTION
set STARTTIME=%TIME%

rem Your code goes here (remove the ping line)
rem ping -n 4 -w 1 127.0.0.1 >NUL
rem timer.bat "SeaChest_Basics_271_1177_64s.exe -d PD2 -i --usbChildInfo --echoCommandLine"  <<-- you need the quotes!
%~1
set ENDTIME=%TIME%

rem ******************  END MAIN CODE SECTION


rem Change formatting for the start and end times
for /F "tokens=1-4 delims=:.," %%a in ("%STARTTIME%") do (
set /A "start=(((%%a*60)+1%%b %% 100)*60+1%%c %% 100)*100+1%%d %% 100"
)

for /F "tokens=1-4 delims=:.," %%a in ("%ENDTIME%") do (
set /A "end=(((%%a*60)+1%%b %% 100)*60+1%%c %% 100)*100+1%%d %% 100"
)

rem Calculate the elapsed time by subtracting values
set /A elapsed=end-start

rem Format the results for output
set /A hh=elapsed/(60*60*100), rest=elapsed%%(60*60*100), mm=rest/(60*100), rest%%=60*100, ss=rest/100, cc=rest%%100
if %hh% lss 10 set hh=0%hh%
if %mm% lss 10 set mm=0%mm%
if %ss% lss 10 set ss=0%ss%
if %cc% lss 10 set cc=0%cc%

set DURATION=%hh%:%mm%:%ss%.%cc%

echo Start    : %STARTTIME%
echo Finish   : %ENDTIME%
echo          ---------------
echo Duration : %DURATION%