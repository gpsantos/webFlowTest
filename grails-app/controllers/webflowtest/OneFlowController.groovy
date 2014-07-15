package webflowtest

class OneFlowController {

    def index() { }

    def stepOneFlow = {
    	firstStep {
    		on('success').to(
                'fillIdentificationInformation'
            )
    	}
    }
}
