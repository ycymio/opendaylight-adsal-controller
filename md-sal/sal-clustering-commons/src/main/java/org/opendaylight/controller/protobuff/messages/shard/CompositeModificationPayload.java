// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompositeModificationPayload.proto

package org.opendaylight.controller.protobuff.messages.shard;

public final class CompositeModificationPayload {
  private CompositeModificationPayload() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registry.add(org.opendaylight.controller.protobuff.messages.shard.CompositeModificationPayload.modification);
  }
  public static final int MODIFICATION_FIELD_NUMBER = 2;
  /**
   * <code>extend .org.opendaylight.controller.cluster.raft.AppendEntries.ReplicatedLogEntry.Payload { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      org.opendaylight.controller.protobuff.messages.cluster.raft.AppendEntriesMessages.AppendEntries.ReplicatedLogEntry.Payload,
      org.opendaylight.controller.protobuff.messages.persistent.PersistentMessages.CompositeModification> modification = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        org.opendaylight.controller.protobuff.messages.persistent.PersistentMessages.CompositeModification.class,
        org.opendaylight.controller.protobuff.messages.persistent.PersistentMessages.CompositeModification.getDefaultInstance());

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"CompositeModificationPayload.proto\022!or" +
      "g.opendaylight.controller.mdsal\032\033AppendE" +
      "ntriesMessages.proto\032\014Common.proto\032\020Pers" +
      "istent.proto:\242\001\n\014modification\022R.org.open" +
      "daylight.controller.cluster.raft.AppendE" +
      "ntries.ReplicatedLogEntry.Payload\030\002 \001(\0132" +
      "8.org.opendaylight.controller.mdsal.Comp" +
      "ositeModificationB6\n4org.opendaylight.co" +
      "ntroller.protobuff.messages.shard"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          modification.internalInit(descriptor.getExtensions().get(0));
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.opendaylight.controller.protobuff.messages.cluster.raft.AppendEntriesMessages.getDescriptor(),
          org.opendaylight.controller.protobuff.messages.common.NormalizedNodeMessages.getDescriptor(),
          org.opendaylight.controller.protobuff.messages.persistent.PersistentMessages.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
