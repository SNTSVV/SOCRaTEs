
# Using SOCRaTEs in Command-Line Manually

## Export jar File from Source Manually
### Environment Preparations
1. Go to **Help -> Install New Software... -> Add...** and paste `http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/` in **Location** and click **OK**. Check **Show only the latest versions of available software**, **Group items by category** and **Contact all update sites during install to find required software**. Then click **Select All** and hit **Next >** (the process is going to take a few minutes). Click **Next >**s and accept agreements until you reach **Finish**. Then eclipse will prompt a **Selection Needed** window. **Select All** and hit **Accept Selected**. Restart eclipse to apply the changes. (**Note: if you encountered any problems, please refer to https://www.eclipse.org/Xtext/**)
2. Clone the repository: `git clone git@github.com:claudiomenghi/SOCRaTEs.git`.
3. Go to **File -> Import... -> Git -> Projects from Git -> Existing local repository -> Add {your project} -> Import existing Eclipse projects** and click **Finish**. 

**Reference**: [Implementing domain specific languages with Xtext and Xtend - Second Edition](https://github.com/varmaprr/books/blob/master/Implementing%20Domain%20Specific%20Languages%20with%20Xtext%20and%20Xtend%20-%20Second%20Edition.pdf) (Page 94 - 97)

### Exporting jar File
4. Open the file named **GenerateSocrates.mwe2** under **lu.snt.socrates -> src -> lu.snt**, and add the snippt below to **StandardLanguage** block and save the file.
```
generator = {
    generateXtendMain = true
}
```
5. Right click **GenerateSocrates.mwe2** and click **Run As -> MWE2 Workflow**. Wait the generation process finished.
6. Right click **Socrates.xtext** and click **Run As -> Generate Xtext Artifacts**. Wait the generation process finished.
7. Right click **Main.xtend** under **lu.snt.socrates -> src -> lu.snt.generator** and click **Run As -> Java Application**. It should report an error message with "Aborting: no path to EMF resource provided". That's ok. It is a preparation step for the next step.
6. Now go to **File -> Export -> Java -> Runnable JAR File**. Make sure you selected the correct **Launch configuration** (It should be the one you generated in the previous step, named as "Main - lu.snt.socrates"), and specify you **Export destination** correctly. Finally, check **Package required libraries into generated JAR** in **Library handling** field and click **Finish**.

## Run SOCRaTEs Translation in Command-Line

```
# Example Command
java -jar <your exported-socrates.jar file path> <your requirement.socrates file path>
```
