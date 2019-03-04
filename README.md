---
author:
- 'Menghi Claudio, Nejati Shiva, Khouloud Gaaloul, Lionel Briand'
title: |
    **SOCRaTEs**\
    **S**imulink **O**racles for **C**PS **R**equiremen**T**s\
    with unc**E**rtainty
---

Section [1](#sec:Overview){reference-type="ref"
reference="sec:Overview"} provides an overview on SOCRaTEs.
Section [2](#sec:installation){reference-type="ref"
reference="sec:installation"} describes how to install SOCRaTEs and how
to create your first SOCRaTEs project.
Section [3](#sec:using){reference-type="ref" reference="sec:using"}
describes how to use SOCRaTEs. Finally
Section [4](#sec:tutorial){reference-type="ref"
reference="sec:tutorial"} provides a tutorial that describes how to use
SOCRaTEs on a set of simple examples.

Overview {#sec:Overview}
========

Installation and Project Creation {#sec:installation}
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

Using SOCRaTEs {#sec:using}
==============

Creating a your Requirements
----------------------------

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

Tutorial {#sec:tutorial}
========
