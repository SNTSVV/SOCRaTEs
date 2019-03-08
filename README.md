![image](Manual/Socrates.png){width="20%"}

-   Section Overview provides an overview on SOCRaTEs.

-   Section Installation and Project Creation describes how to install
    SOCRaTEs and how to create your first SOCRaTEs project.

-   Section Using SOCRaTEs describes how to use SOCRaTEs.

-   Finally Section Tutorial provides a tutorial that describes how to
    use SOCRaTEs on a set of simple examples.

Overview
========

Figure 1 shows an overview of SOCRaTeS (*Simulink Oracles for CPS
RequiremenTs with uncErtainty*), our approach to generate automated test
oracles for CPS models. SOCRaTeS takes three inputs: ((X)**1**;) a CPS
model with parameters or inputs involving uncertainties, ((X)**2**;) a
set of functional requirements for the CPS model and ((X)**3**;) a set
of test inputs that are developed by engineers to test the CPS model
with respects to its requirements. SOCRaTeS makes the following
assumptions about its inputs:

-   *The CPS model is described in Simulink* ((X)**1**;). Simulink
    allows specifying dynamic systems, it is executable and allows
    engineers to test their models as early as possible.

-   *Functional requirements are described in a signal logic-based
    language* ((X)**2**;). We present our requirements language later in
    this document.

-   *A set of test inputs exercising requirements are provided*
    ((X)**3**;). We assume engineers have a set of test inputs for their
    CPS model. The test inputs may be generated manually, randomly or
    based on any test generation framework proposed in the literature.
    SOCRaTeS is agnostic to the selected test generation method.

SOCRaTeS automatically converts functional requirements into oracles
specified in Simulink ((X)**4**;). The oracles evaluate test outputs of
the CPS model in an automated and online manner and generate fitness
values that provide engineers with a degree of satisfaction or failure
for each test input ((X)**5**;). Engineers can stop running a test in
the middle when SOCRaTeS concludes that the test fitness is going to
remain below a given threshold for the rest of its execution.

![An Overview on SOCRaTEs.](Manual/Overview.png){width="70%"}

Installation and Project Creation
=================================

Prerequisite
------------

The following software must be installed on your laptop to run Socrates

-   Eclipse (<https://www.eclipse.org/>)

-   Java 1.8 or superior

-   Matlab/Simulink

Installing Socrates
-------------------

Socrates can be installed by performing the following steps:

-   Click on Help $>$ Install new Software $>$ Add $>$ Local

-   Select the Plugin folder;

-   Uncheck Group items by category;

-   Select Socrates SDK feature;

-   Click on Next $>$ Next $>$ I accept $>$ Finish.

Creating a New Project
----------------------

To create a new project perform the following steps:

-   File $>$ New $>$ Project;

-   Select Project from General;

-   Click on Finish;

Using SOCRaTEs
==============

Creating a file with your Requirements
--------------------------------------

-   Create a file .socrates (File $>$ New $>$ File);

-   When asked to convert into an Xtext project click on Yes.

Generating the .m files using Socrates
--------------------------------------

-   copy the file demo.socrates within your workspace.

-   Change the file (e.g., add a new blank line) and save it

-   When you save the file a file .m is automatically created in the
    folder src-gen/ModelName.

Adding the oracles into your model
----------------------------------

-   Open the Simulink model test

-   Copy the file Test\_Req.m into your workspace

-   Run Test\_Req in Matlab

-   tollerableriskTest\_Req=0;

-   Run your simulation

Tutorial
========

We consider four different scenarios obtained by considering two
different models and two requirements.

The Considered Models
---------------------

The first model generates a sine wave with amplitude $2$ and frequency
$1$ $rad/s$ that is represented in Figure 2.

![The signal $e$ generated from the model Model
1.](Manual/Model1.png){width="50%"}

The second model generates a sine wave with amplitude $0.5$ and
frequency $1$ $rad/s$ that is represented in Figure 3.

![The signal $e$ generated from the model Model
2.](Manual/Model2.png){width="50%"}

The Considered Requirements
---------------------------

The first requirement (Test$\_$Forall) specifies that always the signal
$e$ should not exceed the value $1$. The requirement Test$\_$Forall is
reported in Figure 4.

![The requirement Test$\_$Forall.](Manual/Req1.png){width="80%"}

The second requirement (Test$\_$Exists) specifies that there exists a
time instant in which the signal $e$ exceeds the value $1$. The
requirement Test$\_$Exists is reported in Figure 5.

![The requirement Test$\_$Exists.](Manual/Req2.png){width="95%"}

Replicating the Scenarios
-------------------------

To replicate the scenario

-   open Matlab

-   rename the selected model into `Test.slx`

-   open the file `Test.slx` in Simulink

-   open SOCRaTEs

-   create a new proect as previously described

-   add the file `tutorial.socrates` to your project

-   add an empty line to the file `tutorial.socrates` and save it

-   copy the `.m` file associated with the desired requirement from
    `src-gen/Test` to the Matlab workspace

-   run the `.m` file

-   run the Simulink simulator

Scenario 1
----------

In scenario 1 the model Model 1 and the requirement Test$\_$Forall are
considered. The evaluation of the oracle over time is presented in
Figure 6.

![The evaluation of the oracle for the requirement Test$\_$Forall and
the model Model 1.](Manual/resModel1TestForall.png){width="50%"}

The oracle stops as soon as the requirement is detected to be violated.
The variable $result\_Test\_Forall.Data$ contains the final result that
for this simulation is: $-0.0109$. Note that the result is negative. The
property is indeed violated.

Scenario 2
----------

In scenario 2 the model Model 2 and the requirement Test$\_$Forall are
considered. The evaluation of the oracle over time is presented in
Figure 7.

![The evaluation of the oracle for the requirement Test$\_$Forall and
the model Model 2.](Manual/resModel2TestForall.png){width="50%"}

The variable $result\_Test\_Forall.Data$ contains the final result that
for this simulation is: $0.3333$. Note that the result is positive. The
property is indeed satisfied.

Scenario 3
----------

In scenario 3 the model Model 1 and the requirement Test$\_$Exists are
considered. The evaluation of the oracle over time is presented in
Figure 8.

![The evaluation of the oracle for the requirement Test$\_$Exists and
the model Model 1.](Manual/resModel1TestExists.png){width="50%"}

The variable $result\_Test\_Exists.Data$ contains the final result that
for this simulation is: $0.5$. Note that the result is positive. The
property is indeed satisfied.

Scenario 4
----------

In scenario 4 the model Model 2 and the requirement Test$\_$Exists are
considered. The evaluation of the oracle over time is presented in
Figure 9.

![The evaluation of the oracle for the requirement Test$\_$Exists and
the model Model 2.](Manual/resModel2TestExists.png){width="50%"}

The variable $result\_Test\_Exists.Data$ contains the final result that
for this simulation is: $-0.3333$. Note that the result is negative, and
the simulation stops as soon as the upper-bound of the interval
constrained by the exist operator is reached. The property is indeed not
satisfied.
