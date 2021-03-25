package cromwell.services.metadata.impl.archiver

import akka.actor.{Actor, ActorLogging, ActorRef}
import com.typesafe.config.Config
import cromwell.services.MetadataServicesStore
import cromwell.services.instrumentation.CromwellInstrumentation
import cromwell.services.metadata.impl.MetadataDatabaseAccess

/*
  This class would do same things cromwell.services.metadata.hybridcarbonite.DeleteMetadataActor does
 */

class DeleteMetadataActor(metadataDeletionConfig: Config,
                          override val serviceRegistryActor: ActorRef)
  extends Actor
  with ActorLogging
  with MetadataDatabaseAccess
  with MetadataServicesStore
  with CromwellInstrumentation {

  override def receive: Receive = ???
}
