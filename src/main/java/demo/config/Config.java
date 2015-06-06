package demo.config;

import org.cloudfoundry.community.servicebroker.exception.ServiceBrokerAsyncRequiredException;
import org.cloudfoundry.community.servicebroker.exception.ServiceBrokerException;
import org.cloudfoundry.community.servicebroker.exception.ServiceInstanceBindingExistsException;
import org.cloudfoundry.community.servicebroker.exception.ServiceInstanceDoesNotExistException;
import org.cloudfoundry.community.servicebroker.exception.ServiceInstanceExistsException;
import org.cloudfoundry.community.servicebroker.exception.ServiceInstanceUpdateNotSupportedException;
import org.cloudfoundry.community.servicebroker.model.Catalog;
import org.cloudfoundry.community.servicebroker.model.CreateServiceInstanceBindingRequest;
import org.cloudfoundry.community.servicebroker.model.CreateServiceInstanceRequest;
import org.cloudfoundry.community.servicebroker.model.DeleteServiceInstanceBindingRequest;
import org.cloudfoundry.community.servicebroker.model.DeleteServiceInstanceRequest;
import org.cloudfoundry.community.servicebroker.model.ServiceDefinition;
import org.cloudfoundry.community.servicebroker.model.ServiceInstance;
import org.cloudfoundry.community.servicebroker.model.ServiceInstanceBinding;
import org.cloudfoundry.community.servicebroker.model.UpdateServiceInstanceRequest;
import org.cloudfoundry.community.servicebroker.service.CatalogService;
import org.cloudfoundry.community.servicebroker.service.ServiceInstanceBindingService;
import org.cloudfoundry.community.servicebroker.service.ServiceInstanceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public CatalogService newCatalogService() {
		return new CatalogService() {

			@Override
			public Catalog getCatalog() {
				return new Catalog();
			}

			@Override
			public ServiceDefinition getServiceDefinition(String serviceId) {
				return new ServiceDefinition();
			}

		};
	}

	@Bean
	ServiceInstanceService newServiceInstanceService() {
		return new ServiceInstanceService() {

			@Override
			public ServiceInstance createServiceInstance(
					CreateServiceInstanceRequest createServiceInstanceRequest)
					throws ServiceInstanceExistsException,
					ServiceBrokerException, ServiceBrokerAsyncRequiredException {
				return null;
			}

			@Override
			public ServiceInstance getServiceInstance(String serviceInstanceId) {
				return null;
			}

			@Override
			public ServiceInstance deleteServiceInstance(
					DeleteServiceInstanceRequest deleteServiceInstanceRequest)
					throws ServiceBrokerException,
					ServiceBrokerAsyncRequiredException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ServiceInstance updateServiceInstance(
					UpdateServiceInstanceRequest updateServiceInstanceRequest)
					throws ServiceInstanceUpdateNotSupportedException,
					ServiceBrokerException,
					ServiceInstanceDoesNotExistException,
					ServiceBrokerAsyncRequiredException {
				return null;
			}
		};
	}

	@Bean
	ServiceInstanceBindingService newServiceInstanceBindingService() {
		return new ServiceInstanceBindingService() {

			@Override
			public ServiceInstanceBinding createServiceInstanceBinding(
					CreateServiceInstanceBindingRequest createServiceInstanceBindingRequest)
					throws ServiceInstanceBindingExistsException,
					ServiceBrokerException {
				return null;
			}

			@Override
			public ServiceInstanceBinding deleteServiceInstanceBinding(
					DeleteServiceInstanceBindingRequest deleteServiceInstanceBindingRequest)
					throws ServiceBrokerException,
					ServiceBrokerAsyncRequiredException {
				return null;
			}
		};
	}
}