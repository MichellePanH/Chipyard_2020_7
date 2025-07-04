package chipyard

import freechips.rocketchip.config.{Config}

// ---------------------
// BOOM Configs
// ---------------------

class SmallBoomConfig extends Config(
  new chipyard.iobinders.WithUARTAdapter ++                      // display UART with a SimUARTAdapter
  new chipyard.iobinders.WithTieOffInterrupts ++                 // tie off top-level interrupts
  new chipyard.iobinders.WithBlackBoxSimMem ++                   // drive the master AXI4 memory with a SimAXIMem
  new chipyard.iobinders.WithTiedOffDebug ++                     // tie off debug (since we are using SimSerial for testing)
  new chipyard.iobinders.WithSimSerial ++                        // drive TSI with SimSerial for testing
  new testchipip.WithTSI ++                                      // use testchipip serial offchip link
  new chipyard.config.WithBootROM ++                             // use default bootrom
  new chipyard.config.WithUART ++                                // add a UART
  new chipyard.config.WithL2TLBs(1024) ++                        // use L2 TLBs
  new freechips.rocketchip.subsystem.WithNoMMIOPort ++           // no top-level MMIO master port (overrides default set in rocketchip)
  new freechips.rocketchip.subsystem.WithNoSlavePort ++          // no top-level MMIO slave port (overrides default set in rocketchip)
  new freechips.rocketchip.subsystem.WithInclusiveCache ++       // use Sifive L2 cache
  new freechips.rocketchip.subsystem.WithNExtTopInterrupts(0) ++ // no external interrupts
  new boom.common.WithNSmallBooms(1) ++                          // small boom config
  new freechips.rocketchip.subsystem.WithCoherentBusTopology ++  // hierarchical buses including mbus+l2
  new freechips.rocketchip.system.BaseConfig)                    // "base" rocketchip system

class MediumBoomConfig extends Config(
  new chipyard.iobinders.WithUARTAdapter ++
  new chipyard.iobinders.WithTieOffInterrupts ++
  new chipyard.iobinders.WithBlackBoxSimMem ++
  new chipyard.iobinders.WithTiedOffDebug ++
  new chipyard.iobinders.WithSimSerial ++
  new testchipip.WithTSI ++
  new chipyard.config.WithBootROM ++
  new chipyard.config.WithUART ++
  new chipyard.config.WithL2TLBs(1024) ++
  new freechips.rocketchip.subsystem.WithNoMMIOPort ++
  new freechips.rocketchip.subsystem.WithNoSlavePort ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new freechips.rocketchip.subsystem.WithNExtTopInterrupts(0) ++
  new boom.common.WithNMediumBooms(1) ++                             // medium boom config
  new freechips.rocketchip.subsystem.WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class LargeBoomConfig extends Config(
  new chipyard.iobinders.WithUARTAdapter ++
  new chipyard.iobinders.WithTieOffInterrupts ++
  new chipyard.iobinders.WithBlackBoxSimMem ++
  new chipyard.iobinders.WithTiedOffDebug ++
  new chipyard.iobinders.WithSimSerial ++
  new testchipip.WithTSI ++
  new chipyard.config.WithBootROM ++
  new chipyard.config.WithUART ++
  new chipyard.config.WithL2TLBs(1024) ++
  new freechips.rocketchip.subsystem.WithNoMMIOPort ++
  new freechips.rocketchip.subsystem.WithNoSlavePort ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new freechips.rocketchip.subsystem.WithNExtTopInterrupts(0) ++
  new boom.common.WithNLargeBooms(1) ++                          // large boom config
  new freechips.rocketchip.subsystem.WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class MegaBoomConfig extends Config(
  new chipyard.iobinders.WithUARTAdapter ++
  new chipyard.iobinders.WithTieOffInterrupts ++
  new chipyard.iobinders.WithBlackBoxSimMem ++
  new chipyard.iobinders.WithTiedOffDebug ++
  new chipyard.iobinders.WithSimSerial ++
  new testchipip.WithTSI ++
  new chipyard.config.WithBootROM ++
  new chipyard.config.WithUART ++
  new chipyard.config.WithL2TLBs(1024) ++
  new freechips.rocketchip.subsystem.WithNoMMIOPort ++
  new freechips.rocketchip.subsystem.WithNoSlavePort ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new freechips.rocketchip.subsystem.WithNExtTopInterrupts(0) ++
  new boom.common.WithNMegaBooms(1) ++                        // mega boom config
  new freechips.rocketchip.subsystem.WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class DualSmallBoomConfig extends Config(
  new chipyard.iobinders.WithUARTAdapter ++
  new chipyard.iobinders.WithTieOffInterrupts ++
  new chipyard.iobinders.WithBlackBoxSimMem ++
  new chipyard.iobinders.WithTiedOffDebug ++
  new chipyard.iobinders.WithSimSerial ++
  new testchipip.WithTSI ++
  new chipyard.config.WithBootROM ++
  new chipyard.config.WithUART ++
  new chipyard.config.WithL2TLBs(1024) ++
  new freechips.rocketchip.subsystem.WithNoMMIOPort ++
  new freechips.rocketchip.subsystem.WithNoSlavePort ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new freechips.rocketchip.subsystem.WithNExtTopInterrupts(0) ++
  new boom.common.WithNSmallBooms(2) ++                         // 2 boom cores
  new freechips.rocketchip.subsystem.WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class HwachaLargeBoomConfig extends Config(
  new chipyard.iobinders.WithUARTAdapter ++
  new chipyard.iobinders.WithTieOffInterrupts ++
  new chipyard.iobinders.WithBlackBoxSimMem ++
  new chipyard.iobinders.WithTiedOffDebug ++
  new chipyard.iobinders.WithSimSerial ++
  new testchipip.WithTSI ++
  new chipyard.config.WithBootROM ++
  new chipyard.config.WithUART ++
  new chipyard.config.WithL2TLBs(1024) ++
  new hwacha.DefaultHwachaConfig ++                         // use Hwacha vector accelerator
  new freechips.rocketchip.subsystem.WithNoMMIOPort ++
  new freechips.rocketchip.subsystem.WithNoSlavePort ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new freechips.rocketchip.subsystem.WithNExtTopInterrupts(0) ++
  new boom.common.WithNLargeBooms(1) ++
  new freechips.rocketchip.subsystem.WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class LoopbackNICLargeBoomConfig extends Config(
  new chipyard.iobinders.WithUARTAdapter ++
  new chipyard.iobinders.WithTieOffInterrupts ++
  new chipyard.iobinders.WithBlackBoxSimMem ++
  new chipyard.iobinders.WithTiedOffDebug ++
  new chipyard.iobinders.WithSimSerial ++
  new chipyard.iobinders.WithLoopbackNIC ++                        // drive NIC IOs with loopback
  new testchipip.WithTSI ++
  new icenet.WithIceNIC ++
  new chipyard.config.WithBootROM ++
  new chipyard.config.WithUART ++
  new chipyard.config.WithL2TLBs(1024) ++
  new freechips.rocketchip.subsystem.WithNoMMIOPort ++
  new freechips.rocketchip.subsystem.WithNoSlavePort ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new freechips.rocketchip.subsystem.WithNExtTopInterrupts(0) ++
  new boom.common.WithNLargeBooms(1) ++
  new freechips.rocketchip.subsystem.WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class DromajoBoomConfig extends Config(
  new chipyard.iobinders.WithUARTAdapter ++
  new chipyard.iobinders.WithTieOffInterrupts ++
  new chipyard.iobinders.WithBlackBoxSimMem ++
  new chipyard.iobinders.WithTiedOffDebug ++
  new chipyard.iobinders.WithSimSerial ++
  new chipyard.iobinders.WithSimDromajoBridge ++                 // attach Dromajo
  new testchipip.WithTSI ++
  new chipyard.config.WithTraceIO ++                             // enable the traceio
  new chipyard.config.WithBootROM ++
  new chipyard.config.WithUART ++
  new chipyard.config.WithL2TLBs(1024) ++
  new freechips.rocketchip.subsystem.WithNoMMIOPort ++
  new freechips.rocketchip.subsystem.WithNoSlavePort ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new freechips.rocketchip.subsystem.WithNExtTopInterrupts(0) ++
  new boom.common.WithNSmallBooms(1) ++
  new freechips.rocketchip.subsystem.WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

