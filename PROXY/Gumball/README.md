# Gumball Machine with Proxy Pattern

To get code running on localhost: 

1. Change directories to the same level with headfirst/ folder in bin/

2. Run rmiregistry in background: (PROXY\Gumball\out\production\Gumball)
rmiregistry &

3. Run this command in (PROXY\Gumball\out\production\Gumball)
java ge.gov.smartlogic.proxy.gumball.GumballMachineTestDrive localhost 300


4. In a different window(PROXY\Gumball\out\production\Gumball), run:
java ge.gov.smartlogic.proxy.gumball.GumballMonitorTestDrive localhost