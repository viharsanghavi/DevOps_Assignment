@ECHO OFF
IF NOT "%~f0" == "~f0" GOTO :WinNT
@"D:\DevOps\DevOps_Assignment\bin\ruby.exe" "D:/DevOps/DevOps_Assignment/bin/travis" %1 %2 %3 %4 %5 %6 %7 %8 %9
GOTO :EOF
:WinNT
@"D:\DevOps\DevOps_Assignment\bin\ruby.exe" "%~dpn0" %*
