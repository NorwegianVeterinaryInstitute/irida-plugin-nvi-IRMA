package ca.corefacility.bioinformatics.irida.plugins;

import java.awt.Color;
import java.util.Optional;
import java.util.UUID;

import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;

import ca.corefacility.bioinformatics.irida.model.workflow.analysis.type.AnalysisType;
import ca.corefacility.bioinformatics.irida.pipeline.results.updater.AnalysisSampleUpdater;
import ca.corefacility.bioinformatics.irida.plugins.IridaPlugin;
import ca.corefacility.bioinformatics.irida.plugins.IridaPluginException;
import ca.corefacility.bioinformatics.irida.service.sample.MetadataTemplateService;
import ca.corefacility.bioinformatics.irida.service.sample.SampleService;
import ca.corefacility.bioinformatics.irida.service.workflow.IridaWorkflowsService;



public class IrmaPlugin extends Plugin {

	public static AnalysisType IrmaPlugin = new AnalysisType("IRMA");

	public IrmaPlugin(PluginWrapper wrapper) {
		super(wrapper);
	}

	@Override
	public void start() throws PluginException {
	}

	@Extension
	public static class PluginInfo implements IridaPlugin {

		/* 
		@Override
		public Optional<AnalysisSampleUpdater> getUpdater(MetadataTemplateService metadataTemplateService,
				SampleService sampleService, IridaWorkflowsService iridaWorkflowsService) throws IridaPluginException {
			
			return Optional.of(new ResPointFinderPluginUpdater(metadataTemplateService, sampleService, iridaWorkflowsService));
		}
		*/
		
		@Override
		public AnalysisType getAnalysisType() {
			return IrmaPlugin;
		}

		@Override
		public UUID getDefaultWorkflowUUID() {
			return UUID.fromString("018b3a06-a533-4f94-9849-a5e02af2c169");
		}

		@Override
		public Optional<Color> getBackgroundColor() {
			return Optional.of(Color.decode("#50acb3"));
		}


	}
}