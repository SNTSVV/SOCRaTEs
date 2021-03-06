% original requirement
% (for all t:[0.0,50.0].(e(t+0.0)>1.0))
% shifted requirement
% (for all t:[0.0,50.0].(e(t+0.0)>1.0))
% By running the simulator up to t_fin you compute the results up to t_fin-0.0 due to the shifting procedure
delete_block('Test/Test_Exists')
add_block('simulink/Commonly Used Blocks/Subsystem','Test/Test_Exists')
delete_line('Test/Test_Exists', 'In1/1', 'Out1/1')
delete_block('Test/Test_Exists/In1')
delete_block('Test/Test_Exists/Out1')
%t
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/147c')
add_block('simulink/Commonly Used Blocks/Integrator', 'Test/Test_Exists/147')
add_line('Test/Test_Exists', '147c/1', '147/1')
%0.0
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/31')
set_param('Test/Test_Exists/31', 'Value', '0.0')
%50.0
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/1112014879')
set_param('Test/Test_Exists/1112014879', 'Value', '50.0')
%for all t:[0.0,50.0]
add_block('simulink/Logic and Bit Operations/Relational Operator', 'Test/Test_Exists/1127826101')
add_block('simulink/Logic and Bit Operations/Relational Operator', 'Test/Test_Exists/1127826102')
add_block('simulink/Logic and Bit Operations/Logical Operator', 'Test/Test_Exists/112782610')
add_line('Test/Test_Exists', '31/1', '1127826101/1')
add_line('Test/Test_Exists', '147/1', '1127826101/2')
add_line('Test/Test_Exists', '147/1', '1127826102/1')
add_line('Test/Test_Exists', '1112014879/1', '1127826102/2')
add_line('Test/Test_Exists', '1127826101/1', '112782610/1')
add_line('Test/Test_Exists', '1127826102/1', '112782610/2')
%e
add_block('simulink/Ports & Subsystems/In1', 'Test/Test_Exists/e')
add_block('simulink/Signal Attributes/Rate Transition', 'Test/Test_Exists/132')
add_line('Test/Test_Exists', 'e/1', '132/1')
%e(t+0.0)
add_block('simulink/Math Operations/Gain', 'Test/Test_Exists/-1854867804')
add_line('Test/Test_Exists', '132/1', '-1854867804/1')
%1.0
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/1065353247')
set_param('Test/Test_Exists/1065353247', 'Value', '1.0')
% ExpressionComparison
%(e(t+0.0)>1.0)
add_block('simulink/Math Operations/Add','Test/Test_Exists/-410210744mu')
set_param('Test/Test_Exists/-410210744mu', 'Inputs', '+-')
add_line('Test/Test_Exists', '-1854867804/1', '-410210744mu/1')
add_line('Test/Test_Exists', '1065353247/1', '-410210744mu/2')
add_block('simulink/Math Operations/Abs','Test/Test_Exists/-410210744muabs')
add_line('Test/Test_Exists', '-410210744mu/1', '-410210744muabs/1')
add_block('simulink/Math Operations/Add','Test/Test_Exists/-410210744den')
add_line('Test/Test_Exists', '-410210744muabs/1', '-410210744den/1')
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/-410210744one')
set_param('Test/Test_Exists/-410210744one', 'Value', '1')
add_line('Test/Test_Exists', '-410210744one/1', '-410210744den/2')
add_block('simulink/Math Operations/Divide', 'Test/Test_Exists/-410210744div')
add_line('Test/Test_Exists', '-410210744mu/1', '-410210744div/1')
add_line('Test/Test_Exists', '-410210744den/1', '-410210744div/2')
add_block('simulink/Math Operations/Gain', 'Test/Test_Exists/-410210744gain')
add_line('Test/Test_Exists', '-410210744div/1', '-410210744gain/1')
set_param('Test/Test_Exists/-410210744gain', 'Gain', '1')
add_block('simulink/Signal Routing/Switch', 'Test/Test_Exists/-410210744switch')
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/-410210744epsilon')
set_param('Test/Test_Exists/-410210744epsilon', 'Value', '-0.01')
set_param('Test/Test_Exists/-410210744switch','Criteria', 'u2 ~= 0')
add_line('Test/Test_Exists', '-410210744gain/1', '-410210744switch/1')
add_line('Test/Test_Exists', '-410210744mu/1', '-410210744switch/2')
add_line('Test/Test_Exists', '-410210744epsilon/1', '-410210744switch/3')
add_block('simulink/Signal Attributes/Data Type Conversion', 'Test/Test_Exists/-410210744')
add_line('Test/Test_Exists', '-410210744switch/1', '-410210744/1')
% ExpressionComparisonEnd
%(for all t:[0.0,50.0].(e(t+0.0)>1.0))
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/-1208916169Constant')
set_param('Test/Test_Exists/-1208916169Constant', 'Value', '-1')
add_block('simulink/Signal Routing/Switch', 'Test/Test_Exists/-1208916169Switch')
set_param('Test/Test_Exists/-1208916169Switch', 'Criteria', 'u2 > Threshold')
add_line('Test/Test_Exists', '-1208916169Constant/1', '-1208916169Switch/3')
add_line('Test/Test_Exists', '112782610/1', '-1208916169Switch/2')
add_line('Test/Test_Exists', '-410210744/1', '-1208916169Switch/1')
add_block('simulink/Math Operations/MinMax', 'Test/Test_Exists/-1208916169')
set_param('Test/Test_Exists/-1208916169', 'Function', 'max')
add_line('Test/Test_Exists', '-1208916169Switch/1', '-1208916169/1')
set_param('Test/Test_Exists/-1208916169', 'Inputs', '2')
add_block('simulink/Discrete/Unit Delay', 'Test/Test_Exists/-1208916169Delay')
set_param('Test/Test_Exists/-1208916169Delay', 'X0', '-1')
add_line('Test/Test_Exists', '-1208916169/1', '-1208916169Delay/1')
add_line('Test/Test_Exists', '-1208916169Delay/1', '-1208916169/2')
% miscellaneous
add_block('simulink/Ports & Subsystems/Out1', 'Test/Test_Exists/OutRes')
add_line('Test/Test_Exists', '-1208916169/1', 'OutRes/1')
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/-1208916169finalone')
set_param('Test/Test_Exists/-1208916169finalone', 'Value', '1')
add_block('simulink/Ports & Subsystems/In1','Test/Test_Exists/tollerablerisk')
add_block('simulink/Logic and Bit Operations/Relational Operator', 'Test/Test_Exists/-1208916169timespan')
set_param('Test/Test_Exists/-1208916169timespan', 'Operator', '>=')
add_line('Test/Test_Exists', 'tollerablerisk/1', '-1208916169timespan/1')
add_line('Test/Test_Exists', '-1208916169/1', '-1208916169timespan/2')
add_block('simulink/Signal Routing/Switch', 'Test/Test_Exists/-1208916169Switchfinal')
set_param('Test/Test_Exists/-1208916169Switchfinal', 'Criteria', 'u2 > Threshold')
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/-1208916169finalzero')
set_param('Test/Test_Exists/-1208916169finalzero', 'Value', '0')
add_line('Test/Test_Exists', '-1208916169finalzero/1', '-1208916169Switchfinal/3')
add_block('simulink/Signal Routing/Switch', 'Test/Test_Exists/-1208916169Switchexists')
set_param('Test/Test_Exists/-1208916169Switchexists', 'Criteria', 'u2 > Threshold')
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/-1208916169timec')
add_block('simulink/Commonly Used Blocks/Integrator',  'Test/Test_Exists/-1208916169timeintegrator')
add_line('Test/Test_Exists', '-1208916169timec/1', '-1208916169timeintegrator/1')
add_block('simulink/Commonly Used Blocks/Constant', 'Test/Test_Exists/-1208916169existupperbound')
set_param('Test/Test_Exists/-1208916169existupperbound', 'Value', '50.0')
add_block('simulink/Logic and Bit Operations/Relational Operator', 'Test/Test_Exists/-1208916169stoppingenables')
set_param('Test/Test_Exists/-1208916169stoppingenables', 'Operator', '>=')
add_line('Test/Test_Exists','-1208916169timeintegrator/1','-1208916169stoppingenables/1')
add_line('Test/Test_Exists','-1208916169existupperbound/1','-1208916169stoppingenables/2')
add_line('Test/Test_Exists', '-1208916169stoppingenables/1', '-1208916169Switchexists/2')
add_line('Test/Test_Exists', '-1208916169finalzero/1', '-1208916169Switchexists/3')
add_line('Test/Test_Exists', '-1208916169timespan/1', '-1208916169Switchexists/1')
add_line('Test/Test_Exists', '-1208916169finalone/1', '-1208916169Switchfinal/1')
add_line('Test/Test_Exists', '-1208916169Switchexists/1', '-1208916169Switchfinal/2')
add_block('simulink/Sinks/To Workspace','Test/Test_Exists/stoppingvalueTest_Exists')
set_param('Test/Test_Exists/stoppingvalueTest_Exists','MaxDataPoints','1')
set_param('Test/Test_Exists/stoppingvalueTest_Exists','VariableName','result_Test_Exists')
add_line('Test/Test_Exists', '-1208916169/1', 'stoppingvalueTest_Exists/1')
add_block('simulink/Sinks/Stop Simulation', 'Test/Test_Exists/-1208916169stop')
add_line('Test/Test_Exists', '-1208916169Switchfinal/1', '-1208916169stop/1')
% connecting the model and the requirement 
set_param('Test/Model/e','Port','1')
set_param('Test/Test_Exists/e','Port','1')
add_line('Test', 'Model/1','Test_Exists/1')
add_block('simulink/Sources/Constant','Test/tollerableriskTest_Exists')
set_param('Test/tollerableriskTest_Exists','Value','tollerableriskTest_Exists')
add_line('Test', 'tollerableriskTest_Exists/1','Test_Exists/2')
add_block('simulink/Sinks/To Workspace','Test/outsignalTest_Exists')
set_param('Test/outsignalTest_Exists','MaxDataPoints','1')
set_param('Test/outsignalTest_Exists','Variablename','out_Test_Exists')
add_line('Test', 'Test_Exists/1','outsignalTest_Exists/1')
