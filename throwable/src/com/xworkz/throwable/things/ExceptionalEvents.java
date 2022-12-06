package com.xworkz.throwable.things;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.image.ImagingOpException;
import java.beans.IntrospectionException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.rmi.MarshalException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;
import java.util.zip.ZipError;

import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.print.attribute.UnmodifiableSetException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.DataBindingException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.ws.WebServiceException;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.portable.ApplicationException;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;
import com.sun.javafx.geom.IllegalPathStateException;

public class ExceptionalEvents {

	public void error1() {
		System.out.println("Running error");
		throw new AnnotationFormatError(null, null);
	}

	public void error2() {
		throw new AssertionError();
	}

	public void error3() {
		throw new AWTError(null);
	}

	public void error4() {
		throw new CoderMalfunctionError(null);
	}

	public void error5() {
		throw new FactoryConfigurationError();
	}

	public void error6() {
		throw new FactoryConfigurationError();
	}

	public void error7() {
		throw new IOError(null);
	}

	public void error8() {
		throw new LinkageError();
	}

	public void error9() {
		throw new BootstrapMethodError();
	}

	public void error10() {
		throw new ClassCircularityError();
	}

	public void error11() {
		throw new ClassFormatError();
	}

	public void error12() {
		throw new ExceptionInInitializerError();
	}

	public void error13() {
		throw new IncompatibleClassChangeError();
	}

	public void error14() {
		throw new GenericSignatureFormatError();
	}

	public void error15() {
		throw new UnsupportedClassVersionError();
	}

	public void error16() {
		throw new IncompatibleClassChangeError(null);
	}

	public void error17() {
		throw new AbstractMethodError();
	}

	public void error18() {
		throw new IllegalAccessError();
	}

	public void error19() {
		throw new InstantiationError();
	}

	public void error20() {
		throw new NoSuchFieldError();
	}

	public void error21() {
		throw new NoSuchMethodError();
	}

	public void error22() {
		throw new NoClassDefFoundError();
	}

	public void error23() {
		throw new UnsatisfiedLinkError();
	}

	public void error24() {
		throw new VerifyError();
	}

	public void error25() {
		throw new ZipError(null);
	}

	public void error26() {
		throw new ThreadDeath();
	}

	public void error27() {
		throw new TransformerFactoryConfigurationError();
	}

	public void error28() {
		throw new OutOfMemoryError();
	}

	public void error29() {
		throw new InternalError();
	}

	public void error30() {
		throw new StackOverflowError();
	}

	public void exception1() throws AclNotFoundException {
		System.out.println("Running exception");
		throw new AclNotFoundException();
	}

	public void exception2() throws ActivationException {
		throw new ActivationException();
	}

	public void exception3() throws AlreadyBoundException {
		throw new AlreadyBoundException();
	}

	public void exception4() throws ApplicationException {
		throw new ApplicationException(null, null);
	}

	public void exception5() throws AWTException {
		throw new AWTException(null);
	}

	public void exception6() throws UnsupportedAudioFileException {
		throw new UnsupportedAudioFileException();
	}

	public void exception7() throws BadAttributeValueExpException {
		throw new BadAttributeValueExpException(null);
	}

	public void exception8() throws BadBinaryOpValueExpException {
		throw new BadBinaryOpValueExpException(null);
	}

	public void exception9() throws BadLocationException {
		throw new BadLocationException(null, 0);
	}

	public void exception10() throws BadStringOperationException {
		throw new BadStringOperationException(null);
	}

	public void exception11() throws BrokenBarrierException {
		throw new BrokenBarrierException();
	}

	public void exception12() throws CertificateException {
		throw new CertificateException();
	}

	public void exception13() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void exception14() throws DataFormatException {
		throw new DataFormatException();
	}

	public void exception15() throws DatatypeConfigurationException {
		throw new DatatypeConfigurationException();
	}

	public void exception16() throws DestroyFailedException {
		throw new DestroyFailedException();
	}

	public void exception17() throws ExecutionException {
		throw new ExecutionException(null);
	}

	public void exception18() throws ExpandVetoException {
		throw new ExpandVetoException(null);
	}

	public void exception19() throws FontFormatException {
		throw new FontFormatException(null);
	}

	public void exception20() throws GeneralSecurityException {
		throw new GeneralSecurityException();
	}

	public void exception21() throws GSSException {
		throw new GSSException(0);
	}

	public void exception22() throws IllegalClassFormatException {
		throw new IllegalClassFormatException();
	}

	public void exception23() throws InterruptedException {
		throw new InterruptedException();
	}

	public void exception24() throws IntrospectionException {
		throw new IntrospectionException(null);
	}

	public void exception25() throws UnmodifiableClassException {
		throw new UnmodifiableClassException();
	}

	public void exception26() throws InvalidMidiDataException {
		throw new InvalidMidiDataException();
	}

	public void exception27() throws TimeoutException {
		throw new TimeoutException();
	}

	public void exception28() throws InvalidTargetObjectTypeException {
		throw new InvalidTargetObjectTypeException();
	}

	public void exception29() throws IOException {
		throw new IOException();
	}

	public void exception30() throws SQLException {
		throw new SQLException();
	}

	public void exception31() throws JMException {
		throw new JMException();
	}

	public void exception32() throws KeySelectorException {
		throw new KeySelectorException();
	}

	public void exception33() throws LastOwnerException {
		throw new LastOwnerException();
	}

	public void exception34() throws LineUnavailableException {
		throw new LineUnavailableException();
	}

	public void exception35() throws MarshalException {
		throw new MarshalException(null);
	}

	public void run1() {
		System.out.println("Running run time exception");
		throw new RuntimeException();
	}

	public void run2() {
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void run3() {
		throw new ArithmeticException();
	}

	public void run4() {
		throw new ArrayStoreException();
	}

	public void run5() {
		throw new BufferOverflowException();
	}

	public void run6() {
		throw new BufferUnderflowException();
	}

	public void run7() {
		throw new CannotRedoException();
	}

	public void run8() {
		throw new CannotUndoException();
	}

	public void run9() {
		throw new ClassCastException();
	}

	public void run10() {
		throw new CMMException(null);
	}

	public void run11() {
		throw new UnsupportedOperationException();
	}

	public void run12() {
		throw new DataBindingException(null, null);
	}

	public void run13() {
		throw new UnmodifiableSetException();
	}

	public void run14() {
		throw new EmptyStackException();
	}

	public void run15() {
		throw new EnumConstantNotPresentException(null, null);
	}

	public void run16() {
		throw new WrongMethodTypeException();
	}

	public void run17() {
		throw new FileSystemAlreadyExistsException();
	}

	public void run18() {
		throw new FileSystemNotFoundException();
	}

	public void run19() {
		throw new IllegalArgumentException();
	}

	public void run20() {
		throw new IllegalMonitorStateException();
	}

	public void run21() {
		throw new IllegalPathStateException();
	}

	public void run22() {
		throw new IllegalStateException();
	}

	public void run23() {
		throw new IllformedLocaleException();
	}

	public void run24() {
		throw new ImagingOpException(null);
	}

	public void run25() {
		throw new IncompleteAnnotationException(null, null);
	}

	public void run26() {
		throw new JMRuntimeException();
	}

	public void run27() {
		throw new WebServiceException();
	}

	public void run28() {
		throw new MalformedParameterizedTypeException();
	}

	public void run29() {
		throw new MirroredTypesException(null);
	}

	public void run30() {
		throw new MissingResourceException(null, null, null);
	}

	public void run31() {
		throw new NegativeArraySizeException();
	}

	public void run32() {
		throw new NoSuchElementException();
	}

	public void run33() {
		throw new NoSuchMechanismException();
	}

	public void run34() {
		throw new NullPointerException();
	}

	public void run35() {
		throw new ProfileDataException(null);
	}

}
