package instance.of.keyword;
 class Fireflink {
	
		static void runTest(Testing t) {
			if(t!=null) {
				t.report();
				if(t instanceof ManualTesting) {
					ManualTesting mt =(ManualTesting)t;
					mt.testCase();
				}
				else if(t instanceof AutomationTesting) {
					AutomationTesting at = (AutomationTesting)t;
					at.testScript();
				}
			}
		}
	
	}

