package org.team9432.commands.shooter

import org.team9432.lib.commandbased.commands.SequentialCommand
import org.team9432.lib.commandbased.commands.WaitCommand
import org.team9432.subsystems.Shooter

fun shootAmp() = SequentialCommand(
    Shooter.Commands.setTopSpeed(0.75),
    WaitCommand(2.5),
    Shooter.Commands.setBottomSpeed(0.75),
    WaitCommand(0.5),
    Shooter.Commands.setBottomSpeed(0.0),
    Shooter.Commands.setTopSpeed(0.0)




)